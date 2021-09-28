package ch.zli.m223.punchclock.security;

public interface SecurityConstants {

    String SECRET = "SecretKeyToGenJWTs";
    String TOKEN_PREFIX = "Bearer ";
    String HEADER_STRING = "Authorization";

    String SIGN_UP_URL = "/users/signup";
    String LOGIN_URL = "/users/login";
    int EXPIRATION_TIME = 864000000;

}
