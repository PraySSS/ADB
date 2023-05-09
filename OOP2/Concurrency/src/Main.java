public class Main {
    public static void main(String[] args) {

//       Thread thread=new Thread(new Runnable() {
//           @Override
//           public void run() {
//              for (int i=0;i<5;i++){
//                  System.out.println(i+" worker thread");
//                  try {
//                      Thread.sleep(1000);
//                  } catch (InterruptedException e) {
//                      e.printStackTrace();
//                      throw new RuntimeException(e);
//                  }
//              }
//           }
//       });
//       thread.start();
//
//        for (int i=0;i<5;i++){
//            System.out.println(i+" main thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                throw new RuntimeException(e);
//            }
//        }

        int a = 2;
        int b = 0;

        String name = null;
//        try {
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            System.out.println("B was Zero");
//        }

        try {
            name.equals("Prai");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Name was null");
        }
    }
}