# consumable-code-the-sport-db-api By AmirIsBack
- v1.0.0 - Development

# About This Project
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

# Special From This Project
Simple code and reusable data

# Fecthing Data Library
- Retrofit
- RxJava
- OkHttp
- Chuck Interceptor

# Function Main From This Project
        // Search for team by name
        fun searchForTeamByName(teamName: String, sportResultCallback: SportResultCallback<Teams>)
    
        // Search for team short code
        fun searchForTeamByShortCode(shortCode: String, sportResultCallback: SportResultCallback<Teams>)
    
        // Search for all players from team *Patreon ONLY*
        fun searchForAllPlayerFromTeam(teamName: String, sportResultCallback: SportResultCallback<Players>)
    
        // Search for players by player name
        fun searchForPlayerByName(playerName: String, sportResultCallback: SportResultCallback<Players>)
    
        // Search for players by player name and team name
        fun searchForPlayerByPlayerNameAndTeamName(teamName: String, playerName: String, sportResultCallback: SportResultCallback<Players>)
    
        // List all Teams in a League
        fun searchAllTeamByLeague(league: String, sportResultCallback: SportResultCallback<Teams>)

# Android Library Version (build.gradle)
- ext.kotlin_version = '1.3.61'
- classpath 'com.android.tools.build:gradle:3.6.1'
- compileSdkVersion 29
- buildToolsVersion "29.0.3"
- minSdkVersion 21

# Version Release
This Is Latest Release

    $version_release = 1.0.0

What's New??

    * 
    Some Function for this version is available
    
    // Search for team by name
    fun searchForTeamByName(teamName: String, sportResultCallback: SportResultCallback<Teams>)
    
    // Search for team short code
    fun searchForTeamByShortCode(shortCode: String, sportResultCallback: SportResultCallback<Teams>)
    
    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayerFromTeam(teamName: String, sportResultCallback: SportResultCallback<Players>)
    
    // Search for players by player name
    fun searchForPlayerByName(playerName: String, sportResultCallback: SportResultCallback<Players>)
    
    // Search for players by player name and team name
    fun searchForPlayerByPlayerNameAndTeamName(teamName: String, playerName: String, sportResultCallback: SportResultCallback<Players>)
    
    // List all Teams in a League
    fun searchAllTeamByLeague(league: String, sportResultCallback: SportResultCallback<Teams>)
    *

# How To Use This Project
<h3>Step 1. Add the JitPack repository to your build file</h3>

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
<h3>Step 2. Add the dependency</h3>

	dependencies {
            implementation 'com.github.amirisback:consumable-code-the-sport-db-api:$version_release'
	}
	
<h3>Step 3. Declaration ConsumeTheSportDbApi</h3>

	val consumeTheSportDbApi = ConsumeTheSportDbApi("1") // "1" is API KEY
    consumeTheSportDbApi.searchForPlayerByName(
        "Danny Welbeck",
        object : SportResultCallback<Players> {
            override fun getResultData(data: Players) {
                
                // * PLACE YOUR CODE HERE FOR UI / ARRAYLIST *

            }

            override fun failedResult(statusCode: Int, errorMessage: String?) {}

        })
	

# Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

# Attention !!!
Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account