public Map<Integer, List<Integer>> levelOrder(Node root) {
		if (root == null)
			return null;
		Queue<Node> q = new LinkedList<Node>();
		Map<Integer, List<Integer>> levelOrder = new HashMap<Integer, List<Integer>>();
		List<Integer> list = new ArrayList<>();
		int level = 0;
		q.offer(root);
		q.offer(null);
		while (!q.isEmpty()) {
			Node t = q.poll();
			if (t != null) {
				list.add(t.data);
				if (t.left != null)
					q.offer(t.left);
				if (t.right != null)
					q.offer(t.right);
			} else {
				levelOrder.put(level, list);
				if (!q.isEmpty()) {
					q.offer(null); // It indicates the end of next level
					list = new ArrayList<>();
					level++;
				}
			}
		}
		System.out.println(levelOrder);
		return levelOrder;
	}
