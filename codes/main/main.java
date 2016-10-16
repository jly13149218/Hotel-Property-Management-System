public class Client {
    public static void main(String[] args) {
        UserInfoBLService  UserInfoBLServiceController = new UserInfoController();
        UserInfoBLService_Driver driver = new UserInfoBLService_Driver();
        driver.drive(UserInfoController);
    }
}
