public class DatabaseFactory_Stub implements DatabaseFactory {
      //抽象工厂
    public DataBaseFactory getUserInfoDatabase() {
        UserInfoDatabaseService userInfoData = new UserInfoDataServiceMySqlImpl_Stub();
        return userInfoData;
    }
}
