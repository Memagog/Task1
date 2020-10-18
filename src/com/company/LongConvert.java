package com.company;

public class LongConvert {
    public String longToIp(Integer ip) {
        StringBuilder sb = new StringBuilder(15);

        for (int i = 0; i < 4; i++) {

            sb.insert(0,Integer.toString(ip & 0xff));

            if (i < 3) {
                sb.insert(0,'.');
            }

            ip = ip >> 8;
        }
  System.out.println(sb);
        return sb.toString();
    }
}
