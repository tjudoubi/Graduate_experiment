import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.antlr.v4.runtime.tree.Trees.toStringTree;


public class MyCalculator {
    public static String run(String expr) throws Exception{

        //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream in = new ANTLRInputStream(expr);

        //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        ECMAScriptLexer lexer = new ECMAScriptLexer(in);

        //用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        ECMAScriptParser parser = new ECMAScriptParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(new MyListener(),tree);
        System.out.println(tree.toStringTree(parser));
        return tree.toStringTree(parser);



//        System.out.println(MyListener.intervals.size());
//        for(int i = 0;i < MyListener.intervals.size();i++){
//            System.out.println(MyListener.intervals.get(i));
//        }
//
//         //使用vistor方式遍历语法树
//        MyVisitor visitor = new MyVisitor();
//        visitor.visit(tree);   // 调用visit方法，返回开始遍历program()的语法分析树
//        int size_1 = visitor.intervals.size();
//        int size_2 = visitor.texts.size();
//        int size_3 = visitor.interval_sss.size();
//        System.out.println("Assignment:");
//        for(int i=0;i<size_1;i++){
//            System.out.println(visitor.intervals.get(i).toString());
//        }
//        for(int i=0;i<size_2;i++){
//            System.out.println(visitor.texts.get(i));
//        }
//
//        for(int i = 0;i < size_3;i++){
//            System.out.println(visitor.interval_sss.get(i).toString());
//        }
//
//        System.out.println("If Statement:");
//        for(int i=0;i<visitor.texts_if.size();i++){
//            System.out.println(visitor.texts_if.get(i));
//        }
        //使用listener方式遍历语法树
//        ParseTreeWalker walker = new ParseTreeWalker();
////
//        walker.walk(new MyListener(), tree);

    }

    public static void main(String[] args) throws Exception{
        ArrayList<String> files = getFiles("/home/doubi/KKID_LSK/");

        for(int i = 0;i < files.size();i++) {
            String file_string = files.get(i);
            File file = new File(file_string);
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String res = "";
            String str;
            while ((str = bf.readLine()) != null) {
                res = res + str;
            }
            String write_content = run(res);
            go_write(write_content,file_string);
            System.out.println("\n");
        }

//        for (String s:testStr){
//            System.out.println("Input expr:"+s);
//            run(s);
//        }
    }

    private static void go_write(String write_content,String file_string) throws IOException {
        String[]  file_names = file_string.split("/");
        String file_name = file_names[file_names.length-1];
        FileWriter writer;
        try {
            writer = new FileWriter("/home/doubi/KKID_LSK/target/"+file_name+".txt");

            writer.write("");//清空原文件内容
            writer.write(write_content);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> getFiles(String path) {
        ArrayList<String> files = new ArrayList<String>();
        File file = new File(path);
        File[] tempList = file.listFiles();
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].toString());
                //System.out.println(files.get(i));
                //文件名，不包含路径
                //String fileName = tempList[i].getName();
            }
            if (tempList[i].isDirectory()) {
                //这里就不递归了，
            }
        }
        return files;
    }

}
