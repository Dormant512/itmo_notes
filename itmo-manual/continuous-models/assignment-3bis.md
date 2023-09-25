# Assignment 3bis
*Grigorev Mikhail, J4133c*

Find the solution of initial-value problem:
$$
\begin{cases}\frac{\mathrm{d}x}{\mathrm{d}t} = 2x - 5y + 3 & (1) \\
\frac{\mathrm{d}y}{\mathrm{d}t} = 5x - 6y + 1 & (2) \\
\end{cases} \\
$$

$$
x(0) = 6 \qquad y(0) = 5
$$

Let's start with equation $(2)$:
$$
x = \frac{1}{5}\frac{\mathrm{d}y}{\mathrm{d}t} + \frac{6}{5}y - \frac{1}{5}
$$
Go back to $(1)$:
$$
\frac{\mathrm{d}}{\mathrm{d}t} \Big( \frac{1}{5}\frac{\mathrm{d}y}{\mathrm{d}t} + \frac{6}{5}y - \frac{1}{5} \Big) = 2\Big( \frac{1}{5}\frac{\mathrm{d}y}{\mathrm{d}t} + \frac{6}{5}y - \frac{1}{5} \Big) - 5y + 3 \\
\frac{1}{5}\frac{\mathrm{d}}{\mathrm{d}t} \Big( \frac{\mathrm{d}y}{\mathrm{d}t} + 6y - 1 \Big) = \frac{2}{5}\frac{\mathrm{d}y}{\mathrm{d}t} + \frac{12}{5}y - \frac{2}{5} - 5y + 3 \\
\frac{1}{5} \ddot{y} + \frac{6}{5}\dot{y} = \frac{2}{5}\dot{y} + \frac{12}{5}y - \frac{2}{5} - 5y + 3 \\
\frac{1}{5} \ddot{y} + \frac{4}{5}\dot{y} + \frac{13}{5}y - \frac{13}{5} = 0 \\
\ddot{y} + 4\dot{y} + 13y - 13 = 0
$$
We received second-order DE:
$$
\ddot{y} + 4\dot{y} + 13y - 13 = 0 \\
y(t) = y_{gen}(t) + y_{par}(t)
$$
Let's solve the homogeneous part:
$$
\ddot{y} + 4\dot{y} + 13y = 0 \\
$$
The characteristic polynomial:
$$
\lambda^2 + 4\lambda + 13 = 0 \\
\lambda = -2 \pm 3i
$$
Thus:
$$
y_{gen} = \mathrm{e}^{-2t} \Big( C_1 \cos (3t) + C_2 \sin (3t) \Big)
$$
Particular solution is linear:
$$
y_{par} = \alpha t + \beta \\
\ddot{y} + 4\dot{y} + 13y = 13 \\
0 + 4\alpha + 13\alpha t + 13\beta = 13 \\
\alpha = 0 \qquad \beta = 1 \\
y_{par} = 1
$$
Thus:
$$
y = \mathrm{e}^{-2t} \Big( C_1 \cos (3t) + C_2 \sin (3t) \Big) + 1
$$
Go back:
$$
x = \frac{1}{5} \Big( \frac{\mathrm{d}y}{\mathrm{d}t} + 6y - 1 \Big) \\
5x = \frac{\mathrm{d}y}{\mathrm{d}t} + 6y - 1 \\
\frac{\mathrm{d}y}{\mathrm{d}t} = \mathrm{e}^{-2t} \Big( (3C_2 - 2C_1) \cos (3t) - (3C_1 + 2C_2) \sin (3t) \Big)
$$
Thus:
$$
5x = \mathrm{e}^{-2t} \Big( (3C_2 - 2C_1) \cos (3t) - (3C_1 + 2C_2) \sin (3t) \Big) + \\
+ 6\mathrm{e}^{-2t} \Big( C_1 \cos (3t) + C_2 \sin (3t) \Big) + 6 - 1 \\
5x = \mathrm{e}^{-2t} \Big( (3C_2 + 4C_1) \cos (3t) + (4C_2 - 3C_1) \sin (3t) \Big) + 5 \\
x = \frac{1}{5}\mathrm{e}^{-2t} \Big( (3C_2 + 4C_1) \cos (3t) + (4C_2 - 3C_1) \sin (3t) \Big) + 1
$$
Initial value problem:
$$
x(0) = \frac{1}{5} \cdot 1 \cdot \Big( (3C_2 + 4C_1) \cos (0) + (4C_2 - 3C_1) \sin (0) \Big) + 1 \\
x(0) = \frac{1}{5} \cdot (3C_2 + 4C_1) + 1 \\
x(0) = 0.6 C_2 + 0.8 C_1 + 1
$$
And:
$$
y(0) = 1 \cdot \Big( C_1 \cos (0) + C_2 \sin (0) \Big) + 1 \\
y(0) = C_1 + 1 = 5 \\
C_1 = 4 \\
x(0) = 0.6 C_2 + 0.8 C_1 + 1 = 6 \\
0.6 C_2 + 4.2 = 6 \\
6 C_2 + 42 = 60 \\
C_2 = 3 
$$
Thus, the solution to the initial-value problem is:
$$
x = 5\mathrm{e}^{-2t} \cos (3t) + 1 \\
y = \mathrm{e}^{-2t} \Big( 4 \cos (3t) + 3 \sin (3t) \Big) + 1
$$
 
