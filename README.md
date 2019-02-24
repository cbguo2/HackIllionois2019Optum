## Inspiration
_Working smarter not harder._
Nurses are vital to healthcare but their logistics can deflate their reach to large groups of patients. We want to optimize how nurses are allocated to patients to not only reach more of those who need help but to also give nurses a more time-efficient way of doing so.

## What it does
- Creates clusters of patients based on their similar attributes including **location, priority, task type, etc.**
- Fits nurses to the model of clusters based on the nurse's **location and specialization**
- User interface is an app allowing nurses to see patients in their area in a priority queue

## How we built it
- Created extensive, randomized data for a population of locations in Los Angeles, formatted with Excel
- Parsed the data on Jupyter Notebook to run various clustering algorithms
- Created visual plots to represent data in clusters and predictions for nurses
- Converted output of clustering algorithm to a JSON file
- Created an object-oriented structure in Android Studio to represent contents of JSON file
- Used various data structures (Collections, HashMaps, Lists) to group Patient objects in their clusters
- User Interface implements the google maps API for nurses to see markers for prospective patients

## Challenges we ran into
- Working across languages: Python and Java
- Merging main algorithm with UI
- learning about complex machine learning algorithms

## Accomplishments that we're proud of
- successfully using a clustering algorithm
- Manifesting data that proves the significance of concept

## What we learned
- Working with large amounts of data
- Learning syntax of languages new to us
- working with APIs and JSON
- Statistical analysis in python
- Collaboration and version control with people of various interests

## What's next for NurseNet
- Perfecting the clustering algorithm by taking more attributes into account 
- Creating a cleaner UI that is easier for the nurse to navigate

## How to build, install, and use
**to change dataset:**
- convert the JSON file to csv with an online converter
- parse the csv file in the python code on an IDE of choice
- export the output data of the clustering algorithm and convert back to JSON
- update JSON file in android studio

-Use data of patient cluster locations and nurse locations as the input to the latitude and longitude for the UI so the markers will display on the map

