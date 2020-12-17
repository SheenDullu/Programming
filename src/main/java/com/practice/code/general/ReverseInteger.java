package com.practice.code.general;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        while (x != 0) {
            int remainder = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
            rev = rev * 10 + remainder;
        }
        return rev;
    }
}
