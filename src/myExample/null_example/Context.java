package myExample.null_example;

public class Context {
    private byte[] content;

    public Context(byte[] content) {
        this.content = content;
    }

    public Context() {
    }

    public byte[] getContent() {
        return content;
    }
}
