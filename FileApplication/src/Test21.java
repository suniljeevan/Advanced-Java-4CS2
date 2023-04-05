//counting chars, words and sentences from multithread.txt
import java.io.*;
public class Test21 {
	public static void main(String[] args) throws Exception
	{
        File f=new File("C:\\sunil\\multithread.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int no_of_chars=0, no_of_words=0,no_of_sents=0;
        while((line= br.readLine())!=null) {
        no_of_chars=no_of_chars+line.length();
        String words[] = line.split(" ");
        no_of_words=no_of_words+words.length;
        String sent[]=line.split("\n");
        no_of_sents=no_of_sents+sent.length;
        System.out.println(no_of_sents+" "+line);
	}
       System.out.println("no.of chars is "+no_of_chars);
       System.out.println("no.of words is "+no_of_words);
       System.out.println("no.of sentences is "+no_of_sents);
}
}