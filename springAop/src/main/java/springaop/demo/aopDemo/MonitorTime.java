package springaop.demo.aopDemo;

import java.util.Date;

/**
 * @author kunrong
 * @date 2018/12/25 9:52
 */
public class MonitorTime {
    private String className;
    private String methodName;
    private Date logTime;
    private long comsumeTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public long getComsumeTime() {
        return comsumeTime;
    }

    public void setComsumeTime(long comsumeTime) {
        this.comsumeTime = comsumeTime;
    }

    @Override
    public String toString() {
        return "MonitorTime{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", logTime=" + logTime +
                ", comsumeTime=" + comsumeTime +
                '}';
    }
}
