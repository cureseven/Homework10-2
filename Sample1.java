import java.io.*;

class Dengonban{
  static String filename = "dengonban.txt";
  void read(){
    try{
    File file = new File(dengonban.txt);
    FileWriter filewriter = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(filewriter);
    PrintWriter pw = new PrintWriter(bw);
  }catch(IOException e){
    System.out.println("メッセージはありません．");
  }
}
  void write()throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    pw.println(str);
  }
  }

class Sample1{
  public static void main(String[] args)throws IOException{
    Dengonban d = new Dengonban();
    System.out.println("メッセージを読む：1，書く：2");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int c = parseInt(br.readLine());
    try{
    d.read();
    if(c == 1){
      d.read();
    }else if(c == 2){
      d.write();
    }
  }catch(IOException e){
    System.out.println("入出力エラーです．");
  }
  }
}
