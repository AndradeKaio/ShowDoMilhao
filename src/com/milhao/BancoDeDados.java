package com.milhao;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BancoDeDados 
{
	

	
	private RandomAccessFile randomArchive;
	
	public BancoDeDados(String str)
	{
		try
		{				 
			randomArchive = new RandomAccessFile(str, "rw");			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("ARQUIVO NÃO ENCONTRADO!");
		}
		catch(IOException e)
		{
			System.out.println("FALHA NA LEITURA");
		}
	}

	
	//Escrever no arquivo
	public void writeArchiveString(String str)
	{
		try
		{
			long x = randomArchive.length();
			randomArchive.seek(x);
			randomArchive.writeUTF(str+"\r\n");
			
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void writeArchiveInt(int str)
	{
		try
		{
			long x = randomArchive.length();
			randomArchive.seek(x);
			randomArchive.writeInt(str);
			
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public String readArchive() throws IOException
	{
		return randomArchive.readUTF();		
	}
	public void close()
	{
		try 
		{
     		randomArchive.close();
		}
		catch (IOException e) 
		{		
			e.printStackTrace();
		}
	}
}
