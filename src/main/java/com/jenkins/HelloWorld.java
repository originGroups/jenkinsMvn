package com.jenkins;

import com.jenkins.poi.PoiReadDemo;
import com.jenkins.poi.PoiWriteDemo;

import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("hello jenkins's world!!!");
        /*PoiReadDemo poiReadDemo = new PoiReadDemo();
        poiReadDemo.readPoi();*/
        PoiWriteDemo poiWriteDemo = new PoiWriteDemo();
        poiWriteDemo.writePoi();
    }
}
