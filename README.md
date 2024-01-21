# NewsApp 📰

### Overview :
Kotlin-based Android news app helps users stay up-to-date on the latest headlines.

### Features :
* Display News in various categories 
* Bookmark news to read later/ Delete news
* Check internet connectivity
* Get news from https://newsapi.org with an API_KEY

### Tools & Concepts used :

* **MVVM Architecture**:
MVVM (Model-View-ViewModel) is an Android architectural pattern that separates the application into three components: Model (data and logic), View (user interface), and ViewModel (link between Model and View). It enhances modularity and maintainability.

* **Room Database Library**:
Room is an Android Jetpack library simplifying database operations. It provides an abstraction layer over SQLite, streamlining database handling with entities, DAOs (Data Access Objects), and a database representation. Room promotes efficient database interactions in Android applications.

* **Retrofit2**: 
Retrofit is a popular HTTP client library for Android, simplifying network requests. It utilizes annotations to define API interfaces, enabling seamless conversion of HTTP calls into Java or Kotlin objects. Retrofit supports various data serialization formats and asynchronous requests, making network communication straightforward.

* **Picasso**:
Picasso is an Android image loading library designed for simplicity and efficiency. It streamlines image loading into ImageView components, handles caching to improve performance, and supports transformations. Picasso simplifies image management in Android applications.

### Application Walkthrough:
Welcome to our News App, a user-friendly platform to stay updated on the latest news across various categories. Here's a brief walkthrough of its key features:
1. **Tabs for Every Interest**:
   * Navigate through seven tabs: HOME, BUSINESS, ENTERTAINMENT, SCIENCE, SPORTS, TECHNOLOGY, HEALTH.
   * Each tab presents a curated list of news articles relevant to the selected category.

   
<img width="283" alt="Screenshot 2024-01-20 at 8 35 59 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/7ba28244-b55f-4e68-b254-9779e51ba7c8">
<img width="287" alt="Screenshot 2024-01-20 at 8 36 08 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/3fa0bf76-05b1-4005-9357-339b275ade68">
<img width="274" alt="Screenshot 2024-01-20 at 8 36 17 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/1655c19a-7815-4d7c-8f36-906c28a6681f">
<img width="276" alt="Screenshot 2024-01-20 at 8 36 28 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/0b5c4506-5918-4b89-bf82-9e87090c8178">
    <img width="275" alt="Screenshot 2024-01-20 at 8 36 37 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/7882136e-cbd9-42c4-8ba3-6d3f4d90371b">
<img width="286" alt="Screenshot 2024-01-20 at 8 36 47 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/2b5f8c6b-0fe1-4c7b-99d8-420b3c82d43d">
<img width="277" alt="Screenshot 2024-01-20 at 8 36 56 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/cc2f0ae3-befd-4a23-80aa-024a7b12804c">


##


2. **Read Full Articles**:
   &nbsp;&nbsp;&nbsp;
   * Click on any news headline to read the full article in a webview format.
   * Enjoy a seamless reading experience with an integrated webview.
     
<img width="253" alt="Screenshot 2024-01-21 at 3 04 42 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/7d4c642e-96c6-4eb7-aafe-64d8cdabf33b">
&nbsp;
&nbsp;

##

3. **Save for Later**:
   * Save interesting articles by clicking on the "Read Later" option at the top-right corner of the screen.
   * Enjoy a seamless reading experience with an integrated webview.
<img width="249" alt="Screenshot 2024-01-21 at 3 16 03 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/cd6ad5ba-04af-4cae-8e0f-57cedfd4203c">
<img width="245" alt="Screenshot 2024-01-21 at 3 17 02 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/5e5fe82a-39ea-4ab5-96b3-f2a0a2a1e596">

##

4. **Manage Saved Articles**:
   * View a list of saved articles.
   * Open saved articles for later reading.
   * Delete unwanted articles with a long press.
  
  <img width="256" alt="Screenshot 2024-01-21 at 3 19 19 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/c5b08c4e-2a2d-460c-b5cc-9ae962b2f1ea">
  <img width="253" alt="Screenshot 2024-01-21 at 3 19 30 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/6869dcad-f0e5-4d04-9e97-491b0f426001">
  <img width="255" alt="Screenshot 2024-01-21 at 3 19 38 PM" src="https://github.com/SelmaGuedidi/NewsApp/assets/79056754/2d693215-0b11-4020-a649-6f1f4ef6789d">

##

5. **Internet Connectivity Check**:
   * The app checks for internet connectivity.
   * If there's no internet, a user-friendly message is displayed, ensuring you stay informed about your network status.

![419012873_1287822248562341_2791344985383441524_n](https://github.com/SelmaGuedidi/NewsApp/assets/79056754/03f9f038-6c9a-4f0c-9bad-6247fcfe7709)

