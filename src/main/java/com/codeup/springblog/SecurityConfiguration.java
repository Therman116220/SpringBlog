package com.codeup.springblog;

import org.hibernate.mapping.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityConfiguration {

    public class UserWithRoles extends User implements UserDetails {

        public UserWithRoles(User user) {
            super(user);  // Call the copy constructor defined in User
        }

        @Override
        public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
            String roles = ""; // Since we're not using the authorization part of the component
            return (Collection<? extends GrantedAuthority>) AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
