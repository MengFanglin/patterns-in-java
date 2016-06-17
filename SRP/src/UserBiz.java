public class UserBiz implements IUserBiz {

    @Override
    public boolean changePassword() {
        return false;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }

    @Override
    public void mapUser(IUserBO userBO) {

    }

    @Override
    public boolean addOrg(IUserBO userBO, int orgID) {
        return false;
    }

    @Override
    public boolean addRole(IUserBO userBO, int roleID) {
        return false;
    }
}
