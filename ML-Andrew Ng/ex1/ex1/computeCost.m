function J = computeCost(X, y, theta)
m = size(X,1)
% 求X的第一维度，也就是多少行
predictions  = X*theta;
sqrErrors = (predictions - y) .^ 2;
J = 1/(2*m) * sum(sqrErrors);
endfunction