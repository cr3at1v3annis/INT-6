package com.example.cve_2023_20963;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticatorService extends Service {
    public AuthenticatorService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        MyAuthenticator authenticator = new MyAuthenticator(this);
        return authenticator.getIBinder();
    }
}