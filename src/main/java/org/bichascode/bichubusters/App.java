package org.bichascode.bichubusters;

import org.bichascode.bichubusters.views.InitView;

public final class App {


    private App() {
    }
    public static void main(String[] args) {
      InitView initView = new InitView();
      initView.showInitView();
    }
}
