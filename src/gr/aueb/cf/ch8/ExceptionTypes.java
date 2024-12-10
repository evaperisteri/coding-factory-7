package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {

    }

    /**
     * System.in.read(); throws io exception
     * since a checked exception is thrown, it has to be explicitly
     * thrown in method signature.
     * Or has ot be caught{}
     * When this type of exception may be used?
     * When no need to handle the exception.
     * is this meaningful? No. Ideally,
     * we want to handle exceptions, not only propagate.
     *
     *
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    /**
     * If we catch the exception, no need for 'throws' in method signature
     * and the exception not propagates.
     * is it a good practice not to propagate? it depends.
     * if there is a caller(f.e. a method), then we have to propagate.
     * if there is a client r user then we do not propagate the exception.
     *
     * @return
     */
    public static char readAnotherChar() {
        try {
            return(char) System.in.read();
        }catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

    /**
     * in this type of exception we take action --logging,
     * and also rethrow the exception to propagate to the caller
     * @return
     * @throws IOException
     */
    public static char readAnotherOneChar() throws IOException {
        try {
            return(char) System.in.read();
        }catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readAgainOneChar(char ch) throws IOException, IllegalArgumentException {
        try {
            char inputchar = (char) System.in.read();
            if (inputchar != ch) throw new IllegalArgumentException("Char not fit");
            return inputchar;
        } catch(IOException|IllegalArgumentException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }

//        } catch (IllegalArgumentException ex1) {
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }
    }
}
