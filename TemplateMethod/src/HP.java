public class HP extends ComputerModel{
    @Override
    protected void setMonitor() {
        System.out.println("设置惠普电脑显示器");
    }

    @Override
    protected void setKeyboard() {
        System.out.println("设置惠普电脑键盘");
    }

    @Override
    protected void setSound() {
        System.out.println("设置惠普电脑音响");
    }
}
