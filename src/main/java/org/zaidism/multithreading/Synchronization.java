package org.zaidism.multithreading;

class SeatBooking {
  static int totalSeats = 10;

  // synchronized can be applied here as well at method
  // can add any object to put lock like new Integer or Object() or anything
  // in case of static class you need to use ClassName.class
  public static void bookSeats(int noOfSeats) {
    //synchronized (SeatBooking.class) {
      if (noOfSeats <= totalSeats) {
        System.out.println(noOfSeats + " Seats booked successfully..");
        totalSeats = totalSeats - noOfSeats;
        System.out.println("Seats left " + totalSeats);
      } else {
        System.out.println("Seats cannot be booked only " + totalSeats + " is remaining..");
      }
    }
  //}
}

class Synchronization {

  public static void main(String[] args) {

    Thread thread1 =
        new Thread(
            () -> {
              SeatBooking.bookSeats(10);
            },
            "Thread 1");

    Thread thread2 =
        new Thread(
            () -> {
              SeatBooking.bookSeats(10);
            },
            "Thread 2");

    thread1.start();
    thread2.start();
  }
}
