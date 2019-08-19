package com.boms.guo.util;

import java.net.InetAddress;
import java.net.Socket;

/**
 * 网络工具类
 * @author guo shaung
 */
public class NetUtils {

    public static boolean isLoclePortUsing(int port){

        boolean flag = true;
        try {

            flag = isPortUsing("127.0.0.1", port);

        } catch (Exception e) {

        }
        return flag;
    }

    /**
     *
     * @param host 机器地址
     * @param port 端口
     * @return
     */
    public static boolean isPortUsing(String host,int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress,port);
            socket.close();
            flag = true;
        } catch (Exception e) {

        }
        return flag;
    }

}
