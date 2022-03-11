package com.company;

public class Scope {
    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] elements) {
            this.elements = elements;
            maximumDifference = Integer.MIN_VALUE;
        }


        public void computeDifference() {
            for (int i = 0; i < elements.length; i++) {
                for (int j = i + 1; j < elements.length; j++) {
                    if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
                        maximumDifference = Math.abs(elements[i] - elements[j]);
                    }
                }
            }
        }


    }
}