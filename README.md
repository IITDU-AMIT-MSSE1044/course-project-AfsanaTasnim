# course-project-AfsanaTasnim
course-project-AfsanaTasnim created by GitHub Classroom
Date: 20th November, 2017
"Mining Succinct and High-Coverage API Usage Patterns"
Readmefile-Created By-Afsana Tasnim


-- What the base project did
I have worked on the given paper which mines API usage patters. The paper talks about the usage patterns being succinct and providing high-
coverage. Their proposed approach is Usage Pattern Miner(UP-Miner). The approach is composed of two step clustering and the application
of BIDE algorithm. The first level of clustering is done based on the similarity of the sequences. For this the paper used a technique 
called SeqSim. The SeqSim technique finds out the similarity of the sequences. This is done for all the sequences in the dataset. Using the
SeqSim value, the first level of clustering is done. Next approach is the application of BIDE algorithm. The last step is the application
of clustering once again to find out the required usage patterns. 

-- What I did
I have done the project according to the paper. I have applied two step clustering along with BIDE algorithm. At first two sets are formed from the two sequences. Then, the intersection and union of the two sets are determined. After
that, the weights of the intersection and union sets are determined. Then, by dividing the weight of the intersection by the weight of 
union, the similarity valus is calculated. This is done for all the strings of the entire dataset.Then the first level of clustering is
done where a threshold value is used to cluster the sequences. Once the cluster is formed, the BIDE algoritm is then applied. This 
algorithm finds out the longest matched pattern in the sequences. Then, I performed clustering again. This is the final step. In this step,
the SeqSim value is again calculated and once again, by using a threshold value, cluster is formed. This final level of clustering gives
the required usage patterns. 

-- Details on data I worked on 
The dataset was generated using permutation combination. For this the different letters of english alphabet were chosen. The obtained 
result was the dataset for this work.
-- Detailed Instructions on how to use it
Using this project required installed Java on the computer. The project is to be pulled at first from the github. Then all the /java files
will appear and also the pattern.txt file will be visible. When the class called TestStringsClass is run, the results will be given in 
files.The outputs will be bide1.txt, bide2.txt, bide3.txt, bide4.txt, cluster1.txt, cluster2.txt, cluster3.txt, cluster4.txt, 
FinalCluster2.txt, FinalCluster2a.txt, FinalCluster4.txt, FinalCluster4a.txt, output.txt, Patterns.txt, View.txt and Watch.txt. 
-- Tradeoffs I made while doing the project compared to the base project
The main tradeoff made while doing the project compared to the base project was while generating the dataset. I had to choose among values
that were random to find out all possible combination.

-Afsana Tasnim
MSSE0523
