package rholang.parsing.rholang2.Absyn; // Java Package generated by the BNF Converter.

public abstract class PMBranch implements java.io.Serializable {
  public abstract <R,A> R accept(PMBranch.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(rholang.parsing.rholang2.Absyn.PatternMatch p, A arg);

  }

}
