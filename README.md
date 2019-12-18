![image webapp-boilerplate](https://raw.github.com/brenopolanski/webapp-boilerplate/gh-assets/webapp-boilerplate.gif)

If you want to deliver a web application (or just a web page) as a part of a client application, you can do it using WebView. The WebView class is an extension of Android's View class that allows you to display web pages as a part of your activity layout. It does not include any features of a fully developed web browser, such as navigation controls or an address bar. All that WebView does, by default, is show a web page.

## Instructions to Eclipse users

In order to import **Web App Boilerplate** properly, consider the following steps:

1. Clone project:

        git clone https://github.com/brenopolanski/webapp-boilerplate

2. Import the project to Eclipse.

3. Open the `WebAppActivity.java` file and edit the following line of code with the link to your web page:

        /* Constant that represents the web address that will be loaded in WebView */

        private final String URL = "http://www.your-page.com";
        
4. Navigate to paste **values/** and edit the file `strings.xml` to add a name for your app:

        	res/
            │
        	├── values/
        	│   ├── strings.xml
        
 > Rename **webapp_boilerplate** to the name of your app.

5. Navigate to paste **drawable-hdpi/** and add the icon from your web page in your project:

        	res/
            │
        	├── drawable-hdpi/
        	│   ├── icon.png

 > Obs: Icon (.png) size 72x72 pixels.

6. Building and Running the project for Android and view in your SDK.

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -m "Add some feature"`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request  :)

English is the universal language nowadays, so please don't create or comment on issues using another language.

## History

For detailed changelog, see [Releases](https://github.com/brenopolanski/webapp-boilerplate/releases).

## Authors

- [@autscc](https://github.com/autscc)
- [@brenopolanski](https://github.com/brenopolanski)

## License

[MIT License](https://opensource.org/licenses/MIT)
