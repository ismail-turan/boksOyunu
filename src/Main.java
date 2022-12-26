public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("raul",10,120,100,30);
        Fighter f2=new Fighter("kid",20,85,85,40);

        Match match=new Match(f1,f2,80,110);
        match.run();
    }
}