public class Hello<T> {
    private T variable;

    
    public void setVariable(T variable) {
        this.variable = variable;
    }
    
    @Override
    public String toString() {
        return variable.toString();
    }
  
}