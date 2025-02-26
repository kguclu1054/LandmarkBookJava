Landmark Book Android Application

Overview

This Android application allows users to view famous landmarks from around the world. The app displays a list of landmarks in a RecyclerView, and clicking on an item navigates to a details page with more information about the selected landmark.

Features

RecyclerView Implementation: Displays a list of landmarks.

Data Passing via Intent: Transfers landmark details between activities.

Custom Adapter (LandmarkAdapter): Handles the population of RecyclerView items.

Edge-to-Edge Display Support: Utilizes Android EdgeToEdge API for better UI.

Project Structure

1. MainActivity.java

Initializes the list of landmarks.

Sets up a RecyclerView with a LinearLayoutManager.

Uses LandmarkAdapter to bind data to RecyclerView.

2. LandmarkAdapter.java

Custom RecyclerView adapter to bind data.

Handles click events to open DetailsActivity.

3. DetailsActivity.java

Receives and displays the selected landmark's details.

Uses ViewBinding to interact with UI components.

4. Landmark.java

Model class representing a landmark.

Implements Serializable to pass objects between activities.

Usage

Launch the app to view a list of landmarks.

Click on any landmark to open its details page.

Dependencies

AndroidX RecyclerView for displaying the landmark list.

ViewBinding for easy UI manipulation.

Notes

Ensure that all drawable resources (images) follow proper naming conventions (lowercase, underscores, no spaces).

Future improvements may include database storage, user authentication, and additional filtering options.


Screen Recording

https://drive.google.com/file/d/1PTuI1h1HOEvt-qgxG9wrjNXGNUFKgYjD/view?usp=drive_link

