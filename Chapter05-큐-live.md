
### 대표적인 데이터 구조4: 큐 (Queue)
# 
# ### 1. 큐 구조
# * 줄을 서는 행위와 유사
# * 가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조
#   - 음식점에서 가장 먼저 줄을 선 사람이 제일 먼저 음식점에 입장하는 것과 동일
#   - FIFO(First-In, First-Out) 또는 LILO(Last-In, Last-Out) 방식으로 스택과 꺼내는 순서가 반대
#   
# <img src="https://www.fun-coding.org/00_Images/queue.png" />
# * 출처: http://www.stoimen.com/blog/2012/06/05/computer-algorithms-stack-and-queue-data-structure/
# 
# > 엑셀로 이해해보기

# ### 2. 알아둘 용어
# * Enqueue: 큐에 데이터를 넣는 기능
# * Dequeue: 큐에서 데이터를 꺼내는 기능
# * <font color='#BF360C'>Visualgo 사이트에서 시연해보며 이해하기 (enqueue/dequeue 만 클릭해보며): https://visualgo.net/en/list

# ### 3. 파이썬 queue 라이브러리 활용해서 큐 자료 구조 사용하기
# * **queue 라이브러리에는 다양한 큐 구조로 Queue(), LifoQueue(), PriorityQueue() 제공**
# * <font color='#BF360C'>프로그램을 작성할 때 프로그램에 따라 적합한 자료 구조를 사용</font>
#   - Queue(): 가장 일반적인 큐 자료 구조
#   - LifoQueue(): 나중에 입력된 데이터가 먼저 출력되는 구조 (스택 구조라고 보면 됨)
#   - PriorityQueue(): 데이터마다 우선순위를 넣어서, 우선순위가 높은 순으로 데이터 출력
#   
# > 일반적인 큐 외에 다양한 정책이 적용된 큐들이 있음

# #### 3.1. Queue()로 큐 만들기 (가장 일반적인 큐, FIFO(First-In, First-Out))

# In[1]:

```python

import queue

data_queue = queue.Queue()


# In[2]:


data_queue.put("funcoding")
data_queue.put(1)


# In[3]:


data_queue.qsize()


# In[4]:


data_queue.get()


# In[7]:


data_queue.qsize()


# In[6]:


data_queue.get()


# #### 3.2. LifoQueue()로 큐 만들기 (LIFO(Last-In, First-Out))

# In[9]:


import queue
data_queue = queue.LifoQueue()


# In[10]:


data_queue.put("funcoding")
data_queue.put(1)


# In[11]:


data_queue.qsize()


# In[12]:


data_queue.get()


# #### 3.3. PriorityQueue()로 큐 만들기

# In[15]:


import queue

data_queue = queue.PriorityQueue()


# In[16]:


data_queue.put((10, "korea"))
data_queue.put((5, 1))
data_queue.put((15, "china"))


# In[17]:


data_queue.qsize()


# In[18]:


data_queue.get()


# In[19]:


data_queue.get()

```
