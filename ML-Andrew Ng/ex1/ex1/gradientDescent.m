function [theta, J_history] = gradientDescent(X, y, theta, alpha, num_iters)
%GRADIENTDESCENT Performs gradient descent to learn theta
%   theta = GRADIENTDESCENT(X, y, theta, alpha, num_iters) updates theta by 
%   taking num_iters gradient steps with learning rate alpha

% Initialize some useful values
m = length(y); % number of training examples
J_history = zeros(num_iters, 1);
% J_history现在就是1500行一列0
for iter = 1:num_iters

    % ====================== YOUR CODE HERE ======================
    % Instructions: Perform a single gradient step on the parameter vector
    %               theta. 
    %
    % Hint: While debugging, it can be useful to print out the values
    %       of the cost function (computeCost) and gradient here.
    %
      predict = X*theta;
      %注意不要乘反了
      error = predict - y;
      theta0 = theta(1,1) - alpha/m*sum(error);
      theta1 = theta(2,1) - alpha/m*sum(X(:,2) .* error);
      % 这里的.* 是因为两个列对应相乘
      theta(1,1) = theta0;
      theta(2,1) = theta1;
    






    % ============================================================

    % Save the cost J in every iteration    
    J_history(iter) = computeCost(X, y, theta);

end

end
