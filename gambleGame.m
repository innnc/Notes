bet = 10;
fund = 1000;
count = 0;
nbet = 100:100:10000;
for n = nbet 
	for i = 1:1000 
		x = rand(1,n); 
		win = sum(x <= 0.49) * bet; 
		lose = sum(x > 0.49) * bet;
		fundEnd(i)= fund + win - lose; 
	end
	count = count + 1;
	avr(count) = mean(fundEnd); 
end
plot(nbet, avr);
xlabel("numby at the end");
