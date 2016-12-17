# CarAidSelector

	一個用做類似廣告選單的app

	利用bundle傳遞複雜的intent參數

# Package

	主要在com.example依據功能
	
	constant跟models這兩個submodel
	
	constant放傳遞intent的keys
	
	models放一些至自己用來傳遞物件的vo
	
	而在com.example.caraidselector這個package下
	
	主要的都是放控制畫面的Activity類別
	
# 功能
	
	1. MainActivity: 主要選單頁面，負責產生選單頁面，以及發送intent給下一個
							
						    頁面，顯示最初的Dialog
	
	2. SecondActivity: 顯示選單結果頁面，負責產生選單結果，並提供返回
							
						      前一頁面的button 
	