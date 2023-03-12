package builder;

public class Main {
    public static void main(String[] args) {

        args = new String[]{"html"};

        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + "가 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }


    }

    public static void usage() {
        System.out.println("Usage: java main plain 일반 텍스트로 문서작성");
        System.out.println("Usage: java main html 일반 HTML 파일로 문서작성");
    }
}
