package javapattern.chainofresponsibility3;

public class Problem {
    private String problemName;
    public Problem(String name) {
        this.problemName = name;
    }
    public String getProblemName() {
        return problemName;
    }
}