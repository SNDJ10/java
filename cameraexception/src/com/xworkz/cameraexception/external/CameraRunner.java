package com.xworkz.cameraexception.external;



import com.xworkz.cameraexception.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {

        Camera camera = new Camera();

        camera.displayRam(0);
        camera.displayPrice(80000);
        camera.displayBattery(3000);
        camera.displayBrand("Canon");
        camera.displayName("EOS");
    }
}

