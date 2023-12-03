package org.example.lab5;

public class Task7 {
    private static int numOfCameras;
    private Task7(){}

    public static int minCameraCover(TreeNode root) {
        numOfCameras = 0;
        return calculate(root) == CameraMode.NOT_MONITOR ? numOfCameras + 1 : numOfCameras;
    }

    private static CameraMode calculate(TreeNode root) {
        if (root == null) {
            return CameraMode.MONITOR;
        }

        CameraMode left = calculate(root.left);
        CameraMode right = calculate(root.right);

        if (left == CameraMode.NOT_MONITOR || right == CameraMode.NOT_MONITOR) {
            ++numOfCameras;
            return CameraMode.HAS_CAMERA;
        }

        if (left == CameraMode.HAS_CAMERA || right == CameraMode.HAS_CAMERA)
            return CameraMode.MONITOR;

        return CameraMode.NOT_MONITOR;
    }

    private enum CameraMode{
        NOT_MONITOR,
        MONITOR,
        HAS_CAMERA
    }
}
