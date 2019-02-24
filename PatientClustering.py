#!/usr/bin/env python
# coding: utf-8

import pandas as pd
import matplotlib.pyplot as plt

patientData = pd.read_csv('/Users/isadash/Desktop/PatientAddress.csv', usecols=[5,6])
patientDates = pd.read_csv('/Users/isadash/Desktop/PatientAddress.csv', usecols=[7])
dateDicts = patientDates.to_dict().values()
#print(dateDicts)

from datetime import datetime
d0 = datetime.strptime('2/23/19', "%m/%d/%y")

i = 0
while i<len(day.values()):
    dt = datetime.strptime(list(day.values())[i], "%m/%d/%y")
    #print(dt-d0)
    i+=1
   
patientPoints = patientData.values

xs = patientPoints[:, 0]
ys = patientPoints[:, 1]
plt.scatter(xs, ys)
plt.show() #plain scatter
from sklearn.cluster import KMeans

model = KMeans(n_clusters=20)
model.fit(patientPoints)
#patientLabels = model.predict(patientPoints)

import matplotlib.pyplot as plt
xs = patientPoints[:,0]
ys = patientPoints[:,1]
plt.scatter(xs, ys, c=patientLabels)

plt.show() #color coded clusters

    
centroids = model.cluster_centers_
centroids_x = centroids[:,0] 
centroids_y = centroids[:,1]

from sklearn.neighbors.nearest_centroid import NearestCentroid

i = 0
while i<len(centroids):
    print(i,centroids[i])
    i +=1
    
print(model.labels_)
print(patientData)
plt.scatter(centroids_x, centroids_y, marker='X', s=200)
plt.show() # just centroid markers


nurseData = pd.read_csv('/Users/isadash/Desktop/OptumDataFiles/EmployeeLatLong.csv')
nursePoints = nurseData.values

model.predict(nursePoints)
#nurseLabels = model.predict(nursePoints)

xs = nursePoints[:,0]
ys = nursePoints[:,1]
plt.scatter(xs, ys, c=nurseLabels)
plt.show() #nurses fitted to patient model

labelDictNurses = {}
i = 0
print(model.labels_)
for c in nurseLabels:
    for patient in patientLabels:
        if(c not in labelDict):
            labelDict[c] = 1
        else:
            labelDict[c]+=1
print(labelDict)

labelDictPatient = {}

   




