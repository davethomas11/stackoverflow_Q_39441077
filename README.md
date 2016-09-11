# stackoverflow_Q_39441077


http://stackoverflow.com/questions/39441024/scope-issue-how-to-reference-method/39441077#39441077


Scope Issue. How to reference method?


```
public class A
{
  private final Integer index;

  public Integer getIndex() { return index; }

  public static class B
  {
    //unimportant
  }
}

public class C extends B
{
  //how to reference getIndex() here?
}
```

How can I call getIndex() in class C's body?
