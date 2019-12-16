def merge_sort(a):
  if len(a) <= 1:
    return a
  mid = len(a) // 2
  left = merge_sort(a[:mid])
  right = merge_sort(a[mid:])
  return merge(left, right)


def merge(left, right):
    result = []
    while len(left) > 0 or len(right) > 0:
      if len(left) > 0 and len(right) > 0:

        if left[0] <= right[0]:
            result.append(left[0])
            left = left[1:]
        else:
            result.append(right[0])
            right = right[1:]

      elif len(left) > 0:
          result.append(left[0])
          left = left[1:]
      elif len(right) > 0:
          result.append(right[0])
          right = right[1:]
    return result

"""++++++++++++++++++++++++++++++++++++++++++++++++"""

"""----------------아래는 예시 코드입니다----------------"""

"""++++++++++++++++++++++++++++++++++++++++++++++++"""

a = [54, 26, 93, 17, 77, 31, 44, 55, 20]

print(merge_sort(a))