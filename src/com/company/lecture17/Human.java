package com.company.lecture17;

    public class Human {
        String name;
        int paise;
//        Human() {                                 // non parameterised constructor
//            this.paise = 1000;
//        }
//        Human(int paise) {                          // non parameterised constructor
//            this.paise = paise;
//        }
        public void udhaar() {
            paise += 100;
        }
        public void party() {

            paise -= 500;
        }
    }

