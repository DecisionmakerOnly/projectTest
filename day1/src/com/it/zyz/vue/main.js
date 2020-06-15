const app=new Vue({
	el:'#app',
	data:{
		books:[
			{id:1,name:'《海贼王》',date:'2001-9',price:85.00,count:1},
			{id:1,name:'《重生商纣王》',date:'2001-9',price:225.00,count:4},
			{id:1,name:'《最代码》',date:'2001-9',price:805.00,count:3},
			{id:1,name:'《爱游记》',date:'2001-9',price:852.00,count:2}
		]
	},
	methods:{
		// getFinalPrice(price){
		// 	return '¥'+price.toFixed(2)
		// 	}
		decrement(index){
			this.books[index].count--;
			console.log("decrement");
		},
		increment(index){
			this.books[index].count++;
			console.log("increment");
		},
		removeBtnClick(index){
			this.books.splice(index,1)
		}
	},
	computed:{
		totalPrice(){
			let totalPrice=0;
			for(let i=0;i<this.books.length;i++){
				totalPrice+=this.books[i].price*this.books[i].count
			}
			return totalPrice;
		}
	},
	filters:{
		showPrice(price){
			return '¥'+price.toFixed(2)
		}
	},
})