public interface IUserBiz {
    boolean changePassword();

    boolean deleteUser();

    void mapUser(IUserBO userBO);

    boolean addOrg(IUserBO userBO, int orgID);

    boolean addRole(IUserBO userBO, int roleID);
}

