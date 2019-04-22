package stepic.JAVA_base_course;

import java.math.*;
import java.util.Arrays;

class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(String message) { super(message); }
    public RobotConnectionException(String message, Throwable cause) { super(message, cause); }
}