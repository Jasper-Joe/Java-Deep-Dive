import java.nio.ByteBuffer;

public class Main {
    public static void main(String[] args) {
        /**
         * When you write data into a buffer, the buffer keeps track of how much data you have written.
         * Once you need to read the data, you need to switch the buffer from writing mode into reading mode
         * using the flip() method call.
         * Calling flip() sets the position back to 0, and sets the limit to where position just was. 
         */
        ByteBuffer buf = ByteBuffer.allocate(12);
        buf.put((byte)10);
        buf.put((byte)20).put((byte)30);
        buf.put(new byte[]{40, 50, 60});
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());
        buf.flip();
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());
        for (int i = 0; i < buf.limit(); i++) {
            System.out.println(buf.get() + " ");
        }



    }
}
