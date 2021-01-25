package javapattern.chainofresponsibility3;

public abstract class Expert {
    private Expert next;
    protected String expertName;
    public final void support(Problem p){
        if (solve(p)) {
           System.out.println(expertName+ "이(가) " + p.getProblemName()  +"을(를) 해결해 버렸네.");
        }else{
            if (next != null) {
                next.support(p);
            }else{
                System.out.println(p.getProblemName() + "은(는) 해결할 넘이 없다.");
            }
        }
    }
    public Expert setNext(Expert next){
        this.next = next;
        return next;
    }
    protected abstract boolean solve(Problem p);
}
