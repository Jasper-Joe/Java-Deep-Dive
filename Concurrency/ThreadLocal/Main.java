public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * without threadlocal
         */
        Thread t1 = new Thread(new SharedMapWithUserContext(1));
        Thread t2 = new Thread(new SharedMapWithUserContext(2));
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        /**
         * userId: 1, uuid: 6a9d26fb-3a91-4240-99da-d2abcd91064c
         * userId: 2, uuid: 22de2ded-4e23-4f9e-8614-aa3987f8dda8
         */

        /**
         * using threadlocal
         */
        Thread t3 = new Thread(new ThreadLocalWithUserContext(1));
        Thread t4 = new Thread(new ThreadLocalWithUserContext(2));
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        /**
         * userId: 2 is Context{userNameSecret= 35f9f712-be48-4ed0-baed-fee46654df79 }
         * userId: 1 is Context{userNameSecret= 9e51267c-b46e-42ca-b5ae-631676acca9d }
         */

    }
}
