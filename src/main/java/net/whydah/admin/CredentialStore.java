package net.whydah.admin;

import org.springframework.stereotype.Repository;

/**
 * @author <a href="bard.lind@gmail.com">Bard Lind</a>
 */
@Repository
public class CredentialStore {
    private String userAdminServiceTokenId;

    public String getUserAdminServiceTokenId() {
        return userAdminServiceTokenId;
    }

    public void setUserAdminServiceTokenId(String userAdminServiceTokenId) {
        this.userAdminServiceTokenId = userAdminServiceTokenId;
    }
}
